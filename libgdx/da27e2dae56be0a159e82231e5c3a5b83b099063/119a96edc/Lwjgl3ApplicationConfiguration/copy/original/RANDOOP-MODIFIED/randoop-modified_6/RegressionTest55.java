import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest55 {

    public static boolean debug = false;

    @Test
    public void test27501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27501");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, 10);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (-1), (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) '#', 1, (int) (short) 100, (int) '#', 10, (int) (byte) 0);
    }

    @Test
    public void test27502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27502");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType40);
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("", fileType43);
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color45);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = null;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration47.setTitle("hi!");
        lwjgl3ApplicationConfiguration47.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = null;
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode55);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode57 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode57.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27503");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration14.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        lwjgl3ApplicationConfiguration14.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration27.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration27.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = null;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        com.badlogic.gdx.Graphics.DisplayMode displayMode51 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode51);
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType54);
        com.badlogic.gdx.Graphics.DisplayMode displayMode56 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode56);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', 100, (int) 'a', (int) (byte) 1, (int) (short) 10, (int) 'a', 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode68 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode68);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (byte) 10, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 10);
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27504");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, 100);
    }

    @Test
    public void test27505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27505");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) '4', (int) (short) 1, (int) (byte) 1, (int) (short) 1, (int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration19.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration19.setTitle("");
        lwjgl3ApplicationConfiguration19.setDecorated(true);
        lwjgl3ApplicationConfiguration19.disableAudio(true);
        lwjgl3ApplicationConfiguration19.setWindowPosition(1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration41.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration41.setDecorated(false);
        lwjgl3ApplicationConfiguration41.disableAudio(true);
        lwjgl3ApplicationConfiguration41.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = null;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode66);
        com.badlogic.gdx.Graphics.DisplayMode displayMode68 = null;
        lwjgl3ApplicationConfiguration65.setFullscreenMode(displayMode68);
        lwjgl3ApplicationConfiguration65.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27506");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
    }

    @Test
    public void test27507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27507");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration14.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration21.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        lwjgl3ApplicationConfiguration21.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration34.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration34.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.Graphics.DisplayMode displayMode58 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode58);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = null;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode61);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode63 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode63.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27508");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) -1, (int) (byte) 100, (int) ' ', (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) (byte) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType37);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
    }

    @Test
    public void test27509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27509");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration14.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration14.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration14.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration14.disableAudio(false);
        lwjgl3ApplicationConfiguration14.setBackBufferConfig((int) (short) 100, (int) '#', (int) (short) 1, 100, (int) (short) 100, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration38.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration38.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration38.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration38.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration49.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration49.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration49.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration49.setTitle("");
        lwjgl3ApplicationConfiguration49.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration66 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = null;
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode67);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration66.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color77 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color77);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27510");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) 'a', (int) ' ', 0, (int) (byte) 0, (int) (short) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color45);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) '#', (-1), (int) (short) 100, (int) (short) 1, (-1), (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test27511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27511");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, (int) (byte) -1, (int) (byte) 100, (int) ' ', (int) (byte) 1, (int) (short) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27512");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass46 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test27513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27513");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) 'a', (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test27514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27514");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test27515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27515");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test27516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27516");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test27517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27517");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test27518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27518");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test27519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27519");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test27520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27520");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) ' ', (int) (byte) -1, (int) (byte) 10, 100, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test27521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27521");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration5.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration5.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration11.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27522");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test27523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27523");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) 'a');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27524");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("", fileType30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration28.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration34.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 0, (-1), 0, (int) (byte) -1, 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener66 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener66);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27525");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test27526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27526");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType19);
    }

    @Test
    public void test27527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27527");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType32);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) 10, (int) ' ', (-1), (int) (byte) 100, (int) (short) 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType51);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 0, (-1), (int) (short) 100, (int) (byte) 0, 10, (int) ' ');
    }

    @Test
    public void test27528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27528");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test27529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27529");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test27530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27530");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test27531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27531");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) ' ', (int) (byte) 10, 10, 0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) (byte) 10, (int) ' ', (int) (short) 10, (int) (byte) 1, 0, 100);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test27532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27532");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
    }

    @Test
    public void test27533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27533");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 10, (int) (byte) 10, (-1), (int) (short) -1, (int) (byte) 10, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode37);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode39);
    }

    @Test
    public void test27534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27534");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) '#', (int) (short) 0, (int) (short) 100, (int) (short) 10, 0, (int) ' ');
    }

    @Test
    public void test27535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27535");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) ' ', (int) 'a', (int) (short) 0, (int) (short) 0, (int) (byte) 0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test27536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27536");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) '#');
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
    }

    @Test
    public void test27537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27537");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color34);
        lwjgl3ApplicationConfiguration31.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration31.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration31.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration45.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration45.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration45.setDecorated(false);
        lwjgl3ApplicationConfiguration45.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color61);
        com.badlogic.gdx.Files.FileType fileType64 = null;
        lwjgl3ApplicationConfiguration58.setPreferencesConfig("hi!", fileType64);
        lwjgl3ApplicationConfiguration58.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color68 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color68);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode70 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode70);
        lwjgl3ApplicationConfiguration58.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode75 = null;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode75);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode77);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 0);
        com.badlogic.gdx.graphics.Color color86 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color86);
        com.badlogic.gdx.graphics.Color color88 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color88);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener92 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener92);
        org.junit.Assert.assertTrue("'" + hdpiMode70 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode70.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode77 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode77.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27538");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (byte) 100, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener39 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener39);
    }

    @Test
    public void test27539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27539");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration21.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        lwjgl3ApplicationConfiguration21.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration34.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration34.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType63 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType63);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (-1), (int) (byte) 1, (int) (short) -1, (int) (byte) 10, (int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27540");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
    }

    @Test
    public void test27541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27541");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration5.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration5.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration11.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27542");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = null;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration10.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration10.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration10.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType27);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType35);
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType38);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27543");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 1, 1, (int) (short) 0, 1, (int) '4', (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test27544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27544");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
    }

    @Test
    public void test27545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27545");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color7 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color7);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, 1, 0, 100, (int) (short) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test27546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27546");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (byte) 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test27547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27547");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) (short) 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27548");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (-1));
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 100, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test27549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27549");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test27550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27550");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) '#', (int) 'a');
    }

    @Test
    public void test27551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27551");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, 0);
    }

    @Test
    public void test27552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27552");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) '4', 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
    }

    @Test
    public void test27553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27553");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration17.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration17.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration17.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration17.setDecorated(false);
        lwjgl3ApplicationConfiguration17.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration30.setInitialBackgroundColor(color33);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("hi!", fileType36);
        lwjgl3ApplicationConfiguration30.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3ApplicationConfiguration30.setInitialBackgroundColor(color40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode42 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode42);
        lwjgl3ApplicationConfiguration30.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color58);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode42 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode42.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27554");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.setInitialVisible(true);
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration36.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration36.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration36.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setDecorated(true);
        lwjgl3ApplicationConfiguration36.disableAudio(true);
        lwjgl3ApplicationConfiguration36.setWindowPosition(1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color61);
        lwjgl3ApplicationConfiguration58.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration58.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration58.setDecorated(false);
        lwjgl3ApplicationConfiguration58.disableAudio(true);
        lwjgl3ApplicationConfiguration58.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration82 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode83 = null;
        lwjgl3ApplicationConfiguration82.setHdpiMode(hdpiMode83);
        com.badlogic.gdx.Graphics.DisplayMode displayMode85 = null;
        lwjgl3ApplicationConfiguration82.setFullscreenMode(displayMode85);
        lwjgl3ApplicationConfiguration82.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode91 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration82.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass99 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode91 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode91.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test27555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27555");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode41);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27556");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test27557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27557");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test27558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27558");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 100, (-1));
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) ' ', (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test27559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27559");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test27560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27560");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode30);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 100, (int) ' ', 10, (int) ' ', (int) (byte) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, (-1));
    }

    @Test
    public void test27561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27561");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test27562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27562");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 10, (-1), (int) 'a', 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test27563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27563");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test27564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27564");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27565");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration16.setTitle("hi!");
        lwjgl3ApplicationConfiguration16.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27566");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
    }

    @Test
    public void test27567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27567");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test27568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27568");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (-1), (int) ' ', 0, (int) (short) 100, (int) (byte) 10, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 0, (int) (byte) -1, (int) (short) 10, (int) 'a', (int) (short) 1, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27569");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test27570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27570");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (-1), (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration28.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration28.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration28.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration28.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode45);
        lwjgl3ApplicationConfiguration28.useOpenGL3(false, (-1), (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode51 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode51);
        lwjgl3ApplicationConfiguration28.setWindowPosition((int) (short) 1, 10);
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color56);
        com.badlogic.gdx.Files.FileType fileType59 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("", fileType59);
        lwjgl3ApplicationConfiguration28.setWindowedMode((int) (byte) 0, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration64.setInitialVisible(false);
        lwjgl3ApplicationConfiguration64.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color70 = null;
        lwjgl3ApplicationConfiguration64.setInitialBackgroundColor(color70);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration72 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType74 = null;
        lwjgl3ApplicationConfiguration72.setPreferencesConfig("", fileType74);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = null;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode77);
        com.badlogic.gdx.Graphics.DisplayMode displayMode79 = null;
        lwjgl3ApplicationConfiguration76.setFullscreenMode(displayMode79);
        lwjgl3ApplicationConfiguration76.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode85 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration72.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode85);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode85);
        java.lang.Class<?> wildcardClass91 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode41 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode41.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode85 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode85.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test27571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27571");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27572");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
    }

    @Test
    public void test27573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27573");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test27574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27574");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
    }

    @Test
    public void test27575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27575");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) ' ', (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, 1, (int) (short) -1, 0, (int) (short) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27576");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) -1, (int) (byte) 100, (int) ' ', (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, 10);
    }

    @Test
    public void test27577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27577");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, (int) (short) 10, 100, (int) '4', (int) '#', (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), 0, (int) (byte) 0, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test27578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27578");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) 10);
    }

    @Test
    public void test27579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27579");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (-1), (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 0, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) '#');
    }

    @Test
    public void test27580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27580");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test27581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27581");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
    }

    @Test
    public void test27582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27582");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) 0, (-1));
    }

    @Test
    public void test27583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27583");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test27584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27584");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) '#', (int) (short) 1, 100, (int) (short) 100, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = null;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (-1), (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27585");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 10, (int) (byte) 10, (-1), (int) (short) -1, (int) (byte) 10, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode37 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode37);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode42 = null;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode42);
        lwjgl3ApplicationConfiguration41.setTitle("hi!");
        lwjgl3ApplicationConfiguration41.setInitialVisible(true);
        lwjgl3ApplicationConfiguration41.setDecorated(false);
        lwjgl3ApplicationConfiguration41.setDecorated(true);
        lwjgl3ApplicationConfiguration41.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration54.setInitialVisible(false);
        lwjgl3ApplicationConfiguration54.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode60 = null;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode60);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + hdpiMode62 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode62.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27586");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) 'a', (int) (byte) 1, (int) (byte) 0, (int) (short) 0, 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test27587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27587");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) '4', (int) '#', (int) 'a', 1, (int) (byte) 0, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.Graphics.DisplayMode displayMode29 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener31);
    }

    @Test
    public void test27588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27588");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test27589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27589");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = null;
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode8);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode10 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode10);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, 0, 0, (int) ' ', (int) (short) -1, 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode10 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode10.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27590");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration21.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration21.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration21.setWindowListener(lwjgl3WindowListener28);
        lwjgl3ApplicationConfiguration21.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = null;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration33.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) 'a', (int) (byte) 1, (int) (byte) 10, 0, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass68 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test27591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27591");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (byte) 10);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType21);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 100);
    }

    @Test
    public void test27592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27592");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration13.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration13.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) ' ', (-1), (int) (byte) -1, (int) (short) 1, (int) (short) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass51 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test27593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27593");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType21);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 10, (int) (byte) -1, (int) '4', (-1), (int) (byte) 0, 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener43 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener43);
    }

    @Test
    public void test27594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27594");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration7.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration7.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration7.setDecorated(false);
        lwjgl3ApplicationConfiguration7.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration20.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration20.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType49 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType49);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType55 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType55);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27595");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test27596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27596");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (short) 0, (int) '#', (int) (byte) 0, (int) '4', 0, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) 'a', (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 100);
    }

    @Test
    public void test27597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27597");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 100, (int) (short) 0, (int) (short) 0, (int) (short) 10, 10, (int) '4');
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType40);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) '#');
    }

    @Test
    public void test27598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27598");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test27599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27599");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) 100, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test27600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27600");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType27);
    }

    @Test
    public void test27601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27601");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration5.setPreferencesConfig("", fileType7);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration5.setWindowListener(lwjgl3WindowListener9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration11.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration5.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration5.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("", fileType35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration33.setWindowListener(lwjgl3WindowListener37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration39 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration39.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration39.setInitialBackgroundColor(color42);
        com.badlogic.gdx.Files.FileType fileType45 = null;
        lwjgl3ApplicationConfiguration39.setPreferencesConfig("hi!", fileType45);
        lwjgl3ApplicationConfiguration39.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration39.setInitialBackgroundColor(color49);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration39.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode51);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode58 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode58);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color62 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color62);
        com.badlogic.gdx.graphics.Color color64 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color64);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode51 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode51.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27602");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (-1), 1, 100, 10, (-1), 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) 0, (-1), 1, (int) (short) 10, 0, 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test27603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27603");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 10);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color35);
    }

    @Test
    public void test27604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27604");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) (short) 1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), 0, 0);
    }

    @Test
    public void test27605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27605");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration12.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration12.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration24.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration24.setTitle("");
        lwjgl3ApplicationConfiguration24.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode42 = null;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration12.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color53 = null;
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration50.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration50.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = null;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration61.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration61.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration61.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration61.setTitle("");
        lwjgl3ApplicationConfiguration61.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = null;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode79);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27606");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration12.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27607");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType51 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType51);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType61 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType61);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27608");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 1);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test27609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27609");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) '#');
    }

    @Test
    public void test27610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27610");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration16.setTitle("hi!");
        lwjgl3ApplicationConfiguration16.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27611");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test27612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27612");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27613");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test27614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27614");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, 10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', 100);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27615");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', 0);
    }

    @Test
    public void test27616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27616");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 0);
    }

    @Test
    public void test27617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27617");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) 'a');
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 10, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) '#', 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
    }

    @Test
    public void test27618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27618");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration16.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration16.setDecorated(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration28.setTitle("hi!");
        lwjgl3ApplicationConfiguration28.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = null;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration16.setDecorated(true);
        lwjgl3ApplicationConfiguration16.setBackBufferConfig((int) (byte) 1, (int) ' ', (int) (byte) 1, (int) (short) 0, (-1), (int) '#', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration52.setPreferencesConfig("", fileType54);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = null;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 0, (int) (byte) -1, (int) (short) 0, (int) (short) 0, (int) '4', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener74 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener74);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27619");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 10, 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (byte) 0, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
    }

    @Test
    public void test27620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27620");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) ' ');
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, 100);
    }

    @Test
    public void test27621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27621");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.useVsync(true);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color22);
        lwjgl3ApplicationConfiguration11.setResizable(false);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration28.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration28.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration28.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration28.setWindowListener(lwjgl3WindowListener48);
        lwjgl3ApplicationConfiguration28.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration52.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color55 = null;
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color55);
        com.badlogic.gdx.Files.FileType fileType58 = null;
        lwjgl3ApplicationConfiguration52.setPreferencesConfig("hi!", fileType58);
        lwjgl3ApplicationConfiguration52.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color62 = null;
        lwjgl3ApplicationConfiguration52.setInitialBackgroundColor(color62);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode64 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode64);
        lwjgl3ApplicationConfiguration52.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration68.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color71 = null;
        lwjgl3ApplicationConfiguration68.setInitialBackgroundColor(color71);
        com.badlogic.gdx.Files.FileType fileType74 = null;
        lwjgl3ApplicationConfiguration68.setPreferencesConfig("hi!", fileType74);
        lwjgl3ApplicationConfiguration68.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color78 = null;
        lwjgl3ApplicationConfiguration68.setInitialBackgroundColor(color78);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode80 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color88 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color88);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode64 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode64.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode80 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode80.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27622");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener36 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener36);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
    }

    @Test
    public void test27623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27623");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
    }

    @Test
    public void test27624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27624");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration27.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration27.setTitle("");
        lwjgl3ApplicationConfiguration27.setTitle("");
        lwjgl3ApplicationConfiguration27.disableAudio(false);
        lwjgl3ApplicationConfiguration27.setDecorated(false);
        lwjgl3ApplicationConfiguration27.setWindowedMode(100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration51.setPreferencesConfig("", fileType53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener55 = null;
        lwjgl3ApplicationConfiguration51.setWindowListener(lwjgl3WindowListener55);
        lwjgl3ApplicationConfiguration51.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration51.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = null;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration62.setTitle("hi!");
        lwjgl3ApplicationConfiguration62.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType76 = null;
        lwjgl3ApplicationConfiguration62.setPreferencesConfig("", fileType76);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = null;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration78.setTitle("hi!");
        lwjgl3ApplicationConfiguration78.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration85 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode86 = null;
        lwjgl3ApplicationConfiguration85.setHdpiMode(hdpiMode86);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode88 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration85.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode88);
        com.badlogic.gdx.graphics.Color color95 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color95);
        org.junit.Assert.assertTrue("'" + hdpiMode88 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode88.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27625");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType24);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test27626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27626");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) -1, 0);
    }

    @Test
    public void test27627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27627");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27628");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) 'a');
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (byte) -1);
    }

    @Test
    public void test27629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27629");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), 1, 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test27630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27630");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (short) 1, (int) (short) 100, 100, (-1), (int) (byte) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test27631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27631");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27632");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = null;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration10.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration10.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration10.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) ' ', (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27633");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 10, 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test27634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27634");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (byte) -1);
    }

    @Test
    public void test27635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27635");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test27636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27636");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test27637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27637");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (int) ' ', (int) (short) -1);
    }

    @Test
    public void test27638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27638");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27639");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType21);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (byte) 100, (int) '#', 1, (-1), (int) ' ', 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 10, 1, (int) (byte) 1);
    }

    @Test
    public void test27640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27640");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration20.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType63 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType63);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27641");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27642");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) -1, (int) (byte) 100, (int) ' ', (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test27643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27643");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (-1), (int) (short) 0, 10, (int) (short) 0, (int) ' ', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color49 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color49);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode55 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode55);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test27644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27644");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType11);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) '4', 1, 100, (int) (byte) 0, 1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = null;
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration21.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration21.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration21.setWindowPosition((int) (byte) 1, (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration21.setFullscreenMode(displayMode33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration35.setInitialBackgroundColor(color38);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration35.setPreferencesConfig("hi!", fileType41);
        lwjgl3ApplicationConfiguration35.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = null;
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration45.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration45.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration45.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode58);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + hdpiMode58 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode58.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27645");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (-1), (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 1, (int) (byte) 10, (int) (short) -1, (int) (short) 0, 0, 1, (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test27646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27646");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 10, 1, 1, 0, (int) (short) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test27647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27647");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) 100, (int) (byte) 100, 10, (int) 'a', 0, 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) ' ', 10, (int) (short) 10, (int) (short) 0, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass42 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test27648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27648");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType14);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
    }

    @Test
    public void test27649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27649");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration15.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration15.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration15.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration15.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration15.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration29.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration29.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration29.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration29.setDecorated(false);
        lwjgl3ApplicationConfiguration29.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration42.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration42.setInitialBackgroundColor(color45);
        com.badlogic.gdx.Files.FileType fileType48 = null;
        lwjgl3ApplicationConfiguration42.setPreferencesConfig("hi!", fileType48);
        lwjgl3ApplicationConfiguration42.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3ApplicationConfiguration42.setInitialBackgroundColor(color52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration42.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = null;
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) 'a', (int) (short) 10, (int) (short) -1, 10, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27650");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test27651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27651");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test27652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27652");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration16.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) (short) 0, 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27653");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (short) 0);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType36);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27654");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 0, (int) (short) 0, (int) '4', (int) ' ', (int) (short) 0, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test27655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27655");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 1, (int) (byte) 1, 10, (int) (byte) 100, 1, (int) (short) 100);
    }

    @Test
    public void test27656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27656");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) -1, 100, 0, (int) (byte) 100, (int) (short) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test27657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27657");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 10, (int) (byte) 1, (int) ' ', (int) (byte) -1, 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test27658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27658");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) -1, (int) (short) 0, 1, (int) 'a', (int) (byte) 1, 1);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27659");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 100);
    }

    @Test
    public void test27660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27660");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) '4', (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 0, 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType42);
    }

    @Test
    public void test27661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27661");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, (int) 'a', (int) (byte) 100, (int) (byte) 10, (int) 'a', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) '4', 0, (int) (byte) 0, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test27662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27662");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 0, (-1), 0, 1, (-1), (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color51);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27663");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("", fileType33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration31.setWindowListener(lwjgl3WindowListener35);
        lwjgl3ApplicationConfiguration31.setDecorated(true);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color39);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration31.setFullscreenMode(displayMode41);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = null;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration43.setTitle("hi!");
        lwjgl3ApplicationConfiguration43.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration31.setDecorated(true);
        lwjgl3ApplicationConfiguration31.setBackBufferConfig((int) (byte) 1, (int) ' ', (int) (byte) 1, (int) (short) 0, (-1), (int) '#', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType69 = null;
        lwjgl3ApplicationConfiguration67.setPreferencesConfig("", fileType69);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = null;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode72);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode74);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27664");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test27665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27665");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 1);
    }

    @Test
    public void test27666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27666");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (-1), (int) (short) -1);
    }

    @Test
    public void test27667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27667");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27668");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (byte) 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.Files.FileType fileType35 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType35);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (short) 10);
    }

    @Test
    public void test27669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27669");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = null;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration26.setTitle("hi!");
        lwjgl3ApplicationConfiguration26.setInitialVisible(true);
        lwjgl3ApplicationConfiguration26.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration35.setInitialBackgroundColor(color38);
        lwjgl3ApplicationConfiguration35.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration35.setDecorated(false);
        lwjgl3ApplicationConfiguration35.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color51);
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration48.setPreferencesConfig("hi!", fileType54);
        lwjgl3ApplicationConfiguration48.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color58);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode60 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration48.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode65 = null;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode65);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode67 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode67);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode67);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode60 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode60.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode67 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode67.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27670");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27671");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType34);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27672");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, 100, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test27673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27673");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 0, (int) '4', (int) (short) -1, (int) (byte) -1, (int) '4', (int) (short) 1);
    }

    @Test
    public void test27674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27674");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test27675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27675");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType27);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) '4', (int) ' ', (int) ' ', (int) (byte) 1, (-1), (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test27676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27676");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) 'a', (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType40);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener42 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener42);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27677");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test27678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27678");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode15 = null;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode15);
        lwjgl3ApplicationConfiguration14.setTitle("hi!");
        lwjgl3ApplicationConfiguration14.setInitialVisible(true);
        lwjgl3ApplicationConfiguration14.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration23.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color26);
        lwjgl3ApplicationConfiguration23.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration23.setDecorated(false);
        lwjgl3ApplicationConfiguration23.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color39);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration36.setPreferencesConfig("hi!", fileType42);
        lwjgl3ApplicationConfiguration36.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration36.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType64 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType64);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) 'a', (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode70 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode70);
        org.junit.Assert.assertTrue("'" + hdpiMode48 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode48.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27679");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, (int) (short) 10, 100, (int) '4', (int) '#', (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, (int) (short) -1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener45);
    }

    @Test
    public void test27680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27680");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test27681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27681");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType17);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, 100);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1, (int) '#', (int) (short) 100, (int) 'a');
    }

    @Test
    public void test27682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27682");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test27683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27683");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
    }

    @Test
    public void test27684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27684");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration14.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        lwjgl3ApplicationConfiguration14.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration27.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration27.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = null;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        com.badlogic.gdx.Graphics.DisplayMode displayMode51 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode51);
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType54);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color60);
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27685");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 100);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
    }

    @Test
    public void test27686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27686");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) '#', (int) (short) 1, (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 100, (int) (byte) 100, (int) '4', 0, 1, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test27687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27687");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) '4', (int) (short) 1, (int) (byte) 1, (int) (short) 1, (int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) ' ');
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test27688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27688");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) (short) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) ' ');
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color29);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration26.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration26.setInitialVisible(true);
        lwjgl3ApplicationConfiguration26.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode44 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode44);
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration48.setPreferencesConfig("", fileType50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener52 = null;
        lwjgl3ApplicationConfiguration48.setWindowListener(lwjgl3WindowListener52);
        lwjgl3ApplicationConfiguration48.setDecorated(true);
        com.badlogic.gdx.graphics.Color color56 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color56);
        com.badlogic.gdx.Graphics.DisplayMode displayMode58 = null;
        lwjgl3ApplicationConfiguration48.setFullscreenMode(displayMode58);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = null;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration60.setTitle("hi!");
        lwjgl3ApplicationConfiguration60.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration67 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = null;
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode68);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode70 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration67.setHdpiMode(hdpiMode70);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode70);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode70);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode70);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode70);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode70 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode70.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27689");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) -1, (-1), (int) (byte) -1, (int) (byte) 1, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27690");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (byte) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 10, (int) (byte) 0, (int) (short) -1, (int) (byte) 0, (int) (byte) -1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration19.setTitle("hi!");
        lwjgl3ApplicationConfiguration19.setInitialVisible(true);
        lwjgl3ApplicationConfiguration19.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration28.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration28.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration28.setDecorated(false);
        lwjgl3ApplicationConfiguration28.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color44);
        com.badlogic.gdx.Files.FileType fileType47 = null;
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("hi!", fileType47);
        lwjgl3ApplicationConfiguration41.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration41.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = null;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode58);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode60 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) 'a', (int) '4', (int) (byte) 1, (int) ' ', (int) (byte) 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, (int) '4');
        com.badlogic.gdx.Graphics.DisplayMode displayMode78 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode78);
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode60 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode60.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27691");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test27692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27692");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, 0, (int) (byte) 0, (-1), (int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test27693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27693");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 0, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (short) 100, 10, (int) (byte) 1, (int) (short) -1, (int) (byte) 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color41);
    }

    @Test
    public void test27694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27694");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType27);
    }

    @Test
    public void test27695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27695");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType14);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType21);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 0);
    }

    @Test
    public void test27696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27696");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType41);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27697");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 100, 100);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType27);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        com.badlogic.gdx.Graphics.DisplayMode displayMode33 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode33);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener37 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener37);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27698");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) -1);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 100, (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, (int) (short) -1, (int) (byte) 1);
    }

    @Test
    public void test27699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27699");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 0, (int) (short) 10, 100, (int) '4', (int) (short) 100, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) (byte) 100, (int) (byte) 100, (int) (byte) -1, 0, (int) (short) -1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) '4');
    }

    @Test
    public void test27700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27700");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType39);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color41);
        com.badlogic.gdx.Graphics.DisplayMode displayMode43 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode43);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 0, (int) (short) 100, (int) (short) -1, 0, 10, (int) (byte) -1);
    }

    @Test
    public void test27701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27701");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test27702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27702");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) 'a', (int) (byte) 1, (int) 'a', 0, (int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test27703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27703");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration31 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration31.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration31.setInitialBackgroundColor(color34);
        com.badlogic.gdx.Files.FileType fileType37 = null;
        lwjgl3ApplicationConfiguration31.setPreferencesConfig("hi!", fileType37);
        lwjgl3ApplicationConfiguration31.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode42 = null;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode42);
        lwjgl3ApplicationConfiguration41.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration41.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration41.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration31.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (-1), (int) (short) 1, (int) (short) -1, (-1), (int) (short) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '4', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27704");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.graphics.Color color12 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        com.badlogic.gdx.Graphics.DisplayMode displayMode16 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode16);
    }

    @Test
    public void test27705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27705");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) ' ', (int) (byte) 10, 10, 0, (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test27706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27706");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration21.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        lwjgl3ApplicationConfiguration21.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration34.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration34.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode68 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode68);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27707");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration22.setInitialVisible(false);
        lwjgl3ApplicationConfiguration22.useVsync(false);
        lwjgl3ApplicationConfiguration22.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration22.setWindowedMode((int) (short) 1, (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = null;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration33.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener50 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener50);
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode52);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 10, (int) '4', (-1));
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color60);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test27708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27708");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration16.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("hi!", fileType22);
        lwjgl3ApplicationConfiguration16.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color26 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode28 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode28.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test27709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27709");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) -1, 0, (int) (short) 1, (int) (byte) 100, (int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test27710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27710");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test27711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27711");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 1, (int) 'a', (int) 'a', 1, 1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (byte) 10, (int) (short) 100);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener55 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener55);
    }
}

